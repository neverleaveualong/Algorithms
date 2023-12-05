#include<iostream>
#define MAX 15
using namespace std;

int N, cnt = 0;
int board[MAX];

bool Check(int col) 
{
	for (int i = 1; i < col; i++)
	{
		if (board[i] == board[col] || (col - i) == abs(board[i] - board[col]))
			return false;
	}
}

int nqueen(int col) 
{

	// col 값이 N x N 크기를 벗어난 경우 배치를
	// 다 완료한것을 의미하므로 경우의수 + 1
	if (col > N) {
		cnt++; 
		return 0;
	}

	for (int row = 1; row <= N; row++)
	{
		board[col] = row;
		
		if (Check(col))
		{
			nqueen(col + 1);
		}

	}
}

int main() 
{
	cin >> N;  //입력값
	nqueen(1); //nqueen 1부터 호출
	cout << cnt; //출력
	
}
