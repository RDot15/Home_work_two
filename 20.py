

# Task 1

""" 
n=int(input("Введите степеь двойки: "))
two=2; 
x=0
sum=1
while x<n:
    
    sum=sum*two
    x=x+1
    print (sum)
print (f'2^{n}={sum}') 

 """

# Task 2

""" 
digit=int(input())

eagle=0
reshka=0

for i in range(digit):
    side=int(input())
    if side==1:
        reshka=reshka+1
    else:
        eagle=eagle+1

print(min(eagle, reshka))
 """

# Task 3
""" 
sum=int(input())
composition=int(input())

flag=False
for i in range(1000):
    for j in range(1000):
        if (i+j) ==sum and (i*j)==composition:
            print (i,j)
            
            break

 """        



