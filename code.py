import random

def con(maplist,x,y,cons,conb,cone,conr):
    for q in range(cons):
        x1=random.randint(0,x-conb)
        y1=random.randint(0,y-conb)
        if random.randint(0,1)==0:
            for w in range(max(0,random.randint(x1-cone-conr,x1-cone+conr)),min(x,random.randint(x1+conb+cone-conr,x1+conb+cone+conr))):
                for e in range(max(0,random.randint(y1-cone-conr,y1-cone+conr)),min(y,random.randint(y1+cone-conr,y1+cone+conr))):
                    maplist[e][w]="\u25A0"       
        else:
            for w in range(max(0,random.randint(y1-cone-conr,y1-cone+conr)),min(y,random.randint(y1+conb+cone-conr,y1+conb+cone+conr))):
                for e in range(max(0,random.randint(x1-cone-conr,x1-cone+conr)),min(x,random.randint(x1+cone-conr,x1+cone+conr))):
                    maplist[w][e]="\u25A0"
    return maplist

x=int(input("map length (20)"))
y=int(input("map height (20)"))
cons=int(input("continent saturation (10)"))
conb=int(input("continent base size (1)"))
cone=int(input("continent expansion (2)"))
conr=int(input("continent rigidity (1)"))
maplist=[]
for q in range(y):
    submaplist=[]
    for w in range(x):
        submaplist.append("\u25A1")
    maplist.append(submaplist)

maplist=con(maplist,x,y,cons,conb,cone,conr)
for q in range(y):
    for w in range(x):
        if w==x-1:
            print(maplist[q][w])
        else:
            print(maplist[q][w],end=" ")
