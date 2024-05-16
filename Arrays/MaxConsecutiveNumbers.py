def fun(arr):
    count=0
    ans=0
    for i in range(0,len(arr)):
        if(arr[i]==1):
            count+=1 
        else:
            ans=max(ans,count)
            count=0
    return max(ans,count)
arr=[1,1,0,1,1,1]
print(fun(arr))