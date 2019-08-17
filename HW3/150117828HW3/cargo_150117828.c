#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>
#define macro 6


int i,j,k=0;
int totaltranscon=0;
int customers[500][500];  //defining fundamental arrays
double transactions[500][730];
char forbiddenItems[macro][50];

void printCustomers(){
	
	for(i=0; i<500; i++)
		for(j=0;j<500; j++)
		{
		//	printf("User %d has sent %d cargos price of each is as follows\n",customers[i],customers[i][j]);
		//	printf("price for cargo %d->%d");
		}
}

void seperateItem(char wholeString[], int *itemCount, char item[]){
	
}

void reconstruct(char stringToConstruct[], int start,int end){
	
	
}

int searchWord(char str1[], char str2[]){
	
	
}

void removeForbiddens(char content[], int itemIndex){
	
	if(strcmp(content,forbiddenItems[itemIndex])==0)
		{
			int len = strlen(content); 
    		content[k] = content[k+1];
    		k++;
			removeForbiddens(content,itemIndex);	
	}
	
		itemIndex--;
		removeForbiddens(content,itemIndex);
}

int checkFinish(char stringToCheck[]){
	int i,counter;
	for(i=0; i< 500; i++) //checking whether filled with spaces or not with a counter
		if(stringToCheck[i]==' ');
			counter++;
	if(stringToCheck[0]=='\0' || counter==500) //also checks if it empty or not
		return 0;
	else
		return 1;
}

void getContent(char content[], double *money){
			
	if(checkFinish(content))
	{
		removeForbiddens(content,macro-1);
		
		
	}
}

void contenttransfer(){  // this is the function where the entered cargo content information will be transfered into an array
 	char content[500];  // NOTE: it actually successfully gather blocks of int and content name(bag etc.) in an empty code file
  char *str[256];            //but in this code i couldn't run this method  
                             
  char delimit[]=" \t\r\n\v\f"; //these are the ones that we want to avoid
  int i=0;
  int counter=0;
  if(fgets(content, sizeof content, stdin))
                                                                              
  {                                        
    str[i]=strtok(content,delimit);     
    
    while(str[i]!=NULL)                    
    {
      if (counter%2 == 0)  //for the int part
      {
      	printf("%s",str[i]);
      	i++;
      	str[i]=strtok(NULL,delimit);
      	counter++;
      	
	  }
	  
	  else if( counter%2 == 1) // for the name part
	  {
	  	printf(" %s\n",str[i]);
      	i++;
     	str[i]=strtok(NULL,delimit);  //put a NUlL at the end
     	counter++;
	  }
      
    }

    
  }
 }


int searchCustomer(int customerNumber){
	for(i=0; i<500; i++)
				if(customers[i]==customerNumber) //if it already exists return its index
					return i;
		return -1;						//if not returns -1
}

 

int main(int argc, char *argv[]) {
	
	int answer,custnum;
	char content[500];
	
	printf("Hello Admin PLease Enter the Forbidden Items:\n"); 
	for(i=0; i<macro; i++)					//getting forbiddenitems from user and assigning to an array
       scanf("%s", &forbiddenItems[i]);
       
    printf("Do you want to start the system? 1 --> Yes, 0 --> No: ");
	scanf("%d",&answer);
	
	if(answer){
		printf("Welcome to Cargo Tracking System\n");
		do{
			printf("Please Enter the Customer Number :");
			scanf("%d",&custnum);
		
		while(custnum<0 || (searchCustomer(custnum)!= -1)){    //this while loop detects if custnum is below zero or custnum is entered before or not
			if(custnum<0)										// and if one of these conditions are true then re-asks for custnum
				printf("customer number is not allowed to be under 0");
			
			if(searchCustomer(custnum)!= -1)
				printf("and the entered customer number is already exists");  //warning if already exists
				
			scanf("%d",&custnum);
		}
		
		sprintf(customers[totaltranscon],"%d",custnum);  
		totaltranscon++;
		
		printf("Please Enter the Content of the Cargo :");
		gets(content);
		
		contenttransfer(content);
		
		}while(custnum<0);
		
		printCustomers();
    	
	}
	
	else
		exit(0);
    
    
    	
	return 0;
}
