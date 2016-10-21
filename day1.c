
#include <stdio.h>
#include <stdlib.h>

int main()
{
	FILE* input = fopen("input1.txt", "r");

	char c;

	int floor = 0;

	while(fscanf(input, "%c", &c) == 1)
	{
		printf("%c", c);
		if(c == '(') floor++;
		if(c == ')') floor--;
	}

	printf("%d", floor);
}
