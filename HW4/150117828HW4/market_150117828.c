#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Cem Güleç 150117828

struct Firm{ //defining struct body properties and its name

    int firmID;
    char firmName[100];
    struct Firm *nextfirm;
};
typedef struct Firm firm;


struct Food{
	
	char prod_name[400];
	int exp_day;
	int exp_month;
	int exp_year;
};
typedef struct Food food;


struct FoodStock{
	
	food ffood;
	struct FoodStock *nextfood;
};
typedef struct FoodStock foodstock;


	firm *root=NULL; //global starting nodes
	
	foodstock *root2=NULL;


//adding firm typed ones to linked list in decreasing order
firm *addDecreasedOrder(firm *newF, int id, char *name){

    if(newF==NULL){

        newF=(firm *)malloc(sizeof(firm));
        newF->nextfirm=NULL;
        newF->firmID=id;
        strcpy(newF->firmName,name);

        return newF; //return directly newF if it's beginning node is NULL (if linked list is empty)
    }

    if(newF->firmID <id){ //comparing with the first node. whether if it is small or not

        firm *temp=(firm *)malloc(sizeof(firm));
        temp->firmID=id;
        strcpy(temp->firmName,name);
        temp->nextfirm =newF;

        return temp; //if the conditions in if statement is satisfied after assigning id and name properties, returns new created temp
    }

    firm *iter=newF; //an iterator typed as firm struct pointer

    while(iter->nextfirm != NULL && iter->nextfirm->firmID > id){ //if above 2 situations not happening we need to find the place where we can put our node
    															//(in order to satisfy decreasing order rule)
        iter=iter->nextfirm;
    }

    firm *temp=(firm *)malloc(sizeof(firm));
    temp->nextfirm=iter->nextfirm; //in this situation we need to add this node between 2 node, so arrangements done in this way
    iter->nextfirm=temp;
    temp->firmID=id;				//and assigned our properties into this node
    strcpy(temp->firmName,name);
    
    return newF;	//returned after creating and assigning properties



}


firm *readFirms(char filename[]){

	firm *firms;
	char characters[200]; //array that will hold txt characters
	
    FILE *file= fopen(filename,	"r"); //opening file to read
    int i = 0,j;
    char c;

    if (file == NULL)
        printf("null");


    while ((c = fgetc(file)) != EOF) //checking if we reach to EOF, if not assign characters to array until we reach EOF
    {
        characters[i++] = c;

    }

    characters[i] = '\0'; //assigning EOF character to the end
	fclose(file);
    
    char *token;
    char numbers[10][5];
    char words[10][30];
    token = strtok(characters, " "); // seperating chracter with " " whitespace character in characters array
    
    i= 0;
    int k;
    
    while( token != NULL ) {
        
		        

       if(i %2 == 0) //if the position is 0, this means we got id number and assign it to the numbers array
           sscanf(token,"%s",numbers[i]);
       else 		//if the position is 1, this means we got firm name and assign it to the words array
        	sscanf(token,"%s",words[i]);
        i++;

        token = strtok(NULL, " ");
    }

    
    
    for(j=0; j<i; j++){ // add to linked list as by the number of times i
    	
    	k=atoi(numbers[j]); // converting string to number for integer id part
    	root= addDecreasedOrder(root,k,words[j]); //adding to linked list method
	}
    
    firms=root;
    
    return firms;

}

void printFirms(firm *firmptr){ // print out all the nodes in linked list
    while(firmptr!=NULL){
        printf("%d\n",firmptr->firmID);
        printf("%s\n",firmptr->firmName);
        firmptr = firmptr->nextfirm;
    }
}

foodstock *readFoods(char filename[]){
	
	foodstock *stocks;
	char characters[200];
	FILE *file= fopen(filename,	"r"); //openinig file to read
    int i = 0;
    char c;

    if (file == NULL)
        printf("null");


    while ((c = fgetc(file)) != EOF)
    {
        characters[i++] = c;

    }

    characters[i] = '\0';
	fclose(file);
	
	stocks=root2;
	
	return stocks;
}

void printFood(foodstock *foodptr, char filename[]){
	
	FILE *file=fopen(filename,"w+"); //open file in order to read and write
	
	while(foodptr!=NULL){
        
        fprintf(file,"%d %d %d %s\n",
					foodptr->ffood.exp_day, foodptr->ffood.exp_month, foodptr->ffood.exp_year, foodptr->ffood.prod_name);
        foodptr = foodptr->nextfood;
    }
    
    fclose(file);
}

foodstock *stockOut(foodstock *foodptr, int day, int month, int year){
	
	foodstock *temp, *iter=foodptr;
	
	if(foodptr->ffood.exp_day == day && foodptr->ffood.exp_month == month && foodptr->ffood.exp_year == year){ //if the first one satisfies the conditions delete it
		
		temp=foodptr; //we needed to create temp in order to free it
		foodptr = foodptr->nextfood;
		free(temp);
		
		return foodptr;
	}
	
	while(iter->nextfood !=NULL && (iter->nextfood->ffood.exp_day!=day && iter->nextfood->ffood.exp_month!=month && iter->nextfood->ffood.exp_year!=year)){
											//if not in the first node search it until the conditions satisfied
		iter=iter->nextfood;				//by iterating everytime it's next node
	}
	
	if(iter->nextfood== NULL)		//this means it is the last node and couldn't find a node that satisfies these properties
		return foodptr;
	
	temp=iter->nextfood;			//if it is found somewhere between last node and first need to arrange its connections/pointer bonds in order to free
	iter->nextfood=iter->nextfood->nextfood;
	free(temp);
	
	return foodptr;
}

int main(int argc, char *argv[]) {

	int day,month,year;

    firm *firms=NULL;
    readFirms("firms.txt");
    printFirms(root);
    
    foodstock *stocks;
   	readFoods("products.txt");	
	printFood(stocks,"initial_stock.txt");
	
	printf("Please enter the day, month and year to be checked:\n");
	scanf("%d %d %d",&day,&month,&year);
	stockOut(stocks,day,month,year);
	
	printFood(stocks,"final_stock.txt");

    
    return 0;
}
