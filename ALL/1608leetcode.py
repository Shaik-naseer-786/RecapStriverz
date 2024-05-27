def special(nums):
    nums.sort()
    for i in range(len(nums),0,-1):
        low=0
        high=len(nums)-1
        while(low<=high):
            mid=(low+high)//2
            if(nums[mid]<i):
                low=mid+1
            else:
                high=mid-1
        if(len(nums)-low==i):
            return i
    return -1
nums=[3,4]
print(special(nums))