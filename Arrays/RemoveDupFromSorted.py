def fun(arr):
    k=1
    for i in range(1,len(arr)):
        if(arr[i]!=arr[i-1]):
            arr[k]=arr[i]
            k+=1
    print(arr)
    return k 
arr=[1,1,2]
print(fun(arr))