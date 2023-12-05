#include<iostream>
#include<cmath>
using namespace std;

const int MAX_N = 15;
int n;
int col[MAX_N];
int cnt = 0; // 경우의 수를 세기 위한 변수

bool promising(int i) {
    int k = 1;
    bool switchFlag = true;

    while (k < i && switchFlag) {
        if (col[i] == col[k] || abs(col[i] - col[k]) == i - k) {
            switchFlag = false;
        }
        k++;
    }

    return switchFlag;
}

void queens(int i) {
    int j;

    if (i == n) {
        // 출력: 경우의 수 증가
        cnt++;
        return;
    }

    for (j = 1; j <= n; j++) {
        col[i + 1] = j;
        if (promising(i + 1)) {
            queens(i + 1);
        }
    }
}

int main() {
    cin >> n;
    queens(0); // queens 함수의 시작은 0부터
    cout << cnt << endl; // 경우의 수 출력
    return 0;
}
