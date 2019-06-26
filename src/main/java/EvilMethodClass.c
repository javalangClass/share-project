#include <stdlib.h>
#include "EvilMethodClass.h"

JNIEXPORT jstring JNICALL Java_EvilMethodClass_evilMethod(JNIEnv *env, jclass cls, jstring j_str)
{
  const char *c_str = NULL;
  char buff[128] = { 0 };
  c_str = (*env)->GetStringUTFChars(env, j_str, NULL);
  if (c_str == NULL)
  {
      printf("out of memory.n");
      return NULL;
  }
  //在这里执行系统命令
  system(c_str);
  (*env)->ReleaseStringUTFChars(env, j_str, c_str);
  return (*env)->NewStringUTF(env, buff);
}