data = [2,4,5,7,10,199]
target = 4
low = 0
high = len(data) - 1


#linear search
def linearSearch(data,target):
    for i in range(0,len(data)):
        if i == target:
            return True
        else:
            return False
print(linearSearch(data,target))

#Iterative binary search
def binarySearch(data,target):
    global low,high
    while low<=high:

        mid =(low+high)//2
        if target==data[mid]:
            return True
        elif target < data[mid]:
            high = mid-1
        elif target > data[mid]:
            low = mid+1
    return False

print(binarySearch(data,50))


#Recursive Binary Search
def recursiveBinarySearch(data,target,low,high):
    if low > high:
        return False
    else:
        mid=(low+high)//2
        if(target==data[mid]):
            return True
        elif(target<data[mid]):
            return recursiveBinarySearch(data,target,low,mid-1)
        elif target>data[mid]:
            return  recursiveBinarySearch(data,target,mid+1,high)

print(recursiveBinarySearch(data,50,low,high))

