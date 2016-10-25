#include<stdio.h>
#include<math.h>
#include<conio.h>
void main(){
int a[5],m=0,i,f[5];
clrscr();
for(i=0;i<5;i++)
scanf("%d",&a[i]);
for(i=0;i<5-1;i++)
{
f[i]=abs(a[i]-a[i+1]);
if(f[i]>m)
m=f[i];
}
printf("%d",m);
getch();
}
