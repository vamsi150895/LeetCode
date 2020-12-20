
class Solution(object):
    # def isPalindrome(s):
        # return s == s[::-1]
        
    def count_occurances(self, A, number,search_first):
        left = 0
        right = len(A) - 1  
        result = -1
        while( left <= right):
        
            mid = ((left + right) // 2 )
            
            if(A[mid] == number):
                result = mid
                if search_first:
                    right = mid -1 
                else:
                    left = mid + 1
                    
            elif(A[mid] > number):
                right = mid - 1
            else:
                left = mid + 1
            
        return result
        
        
        
        
sorted_list = Solution()
A = [2,3,3,4,4,5,5,5,6,7,7,7,9,9,9]
number = int(input('Enter the number you want to search for: '))

first = sorted_list.count_occurances(A, number, True)  
last = sorted_list.count_occurances(A, number, False)  
count = last - first + 1
print(first, last, count)
