def merge(left,right):
    
    result = []
    i = 0
    j = 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    if i<len(left):
        for k in range(i,len(left)):
            result.append(left[k])
    if j<len(right):
        for k in range(j,len(right)):
            result.append(right[k])
    return result

 

def sort(A):
    if len(A)<=1:
        return A
    else:
        middle = int (len(A)/2)
        left = sort(A[:middle])
        right = sort(A[middle:])
        return merge(left,right)



print (sort(A = [2,3,1,5,1,77,24,23,22]))
