def count ():
    f=open('story.txt', 'r')
    d = f.readlines()
    c=0
    for i in d:
        if i[0]== 'I' or i[0] == 'M':
            c=c+1
    print("Total lines are: ", c)
    
count() 

