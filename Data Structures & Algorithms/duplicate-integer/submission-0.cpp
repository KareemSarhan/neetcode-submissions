#include <iostream>
#include <unordered_set>

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::unordered_set<int> myHashSet;
        for (size_t i = 0; i < nums.size(); ++i) {
            if (myHashSet.contains(nums.at(i)))
            {
                return true;
            }
            myHashSet.insert(nums.at(i));
        }
        return false;
    }
};