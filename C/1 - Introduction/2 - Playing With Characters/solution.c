#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  int BUFFSIZE = 256;

  char c;
  char str[BUFFSIZE];
  char sen[BUFFSIZE];

  scanf("%c ", &c);
  scanf("%s ", str);
  fgets(sen, BUFFSIZE, stdin);

  printf("%c\n", c);
  printf("%s\n", str);
  printf("%s\n", sen);

  return 0;
}
