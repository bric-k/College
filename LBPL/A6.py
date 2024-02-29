def displayMeMy():
   num=0
   f=open("story.txt","rt")
   N=f.read()
   M=N.split()
   for x in M:
     if x=="Me" or x== "My":
       print(x)
       num=num+1
   f.close()
   print("Count of Me/My in file:",num)
