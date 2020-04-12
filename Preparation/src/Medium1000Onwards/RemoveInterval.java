package Medium1000Onwards;

public class RemoveInterval {

	/*
	 class Solution {
public:
    vector<vector<int>> removeInterval(vector<vector<int>>& intervals, vector<int>& toBeRemoved) {
        vector<vector<int>> ans;
        int mx = toBeRemoved[0], my = toBeRemoved[1];
        for (const auto &i : intervals) {
            int x = i[0], y = i[1];
            if (y <= mx || x >= my) ans.push_back(i);
            else {
                if (x < mx) ans.push_back({x, mx});
                if (y > my) ans.push_back({my, y});
            }
        }
        return ans;
    }
};

	 */
}
