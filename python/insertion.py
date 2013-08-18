l = [3,5,2,1,8,4];
n = len(l)


for i in range(1,n):
        j = i-1 
        key = l[i]
        while (l[j] > key) and (j >= 0):
           l[j+1] = l[j]
           j -= 1
        l[j+1] = key

print (l)
        
