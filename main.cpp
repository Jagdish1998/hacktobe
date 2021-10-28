#include<bits/stdc++.h>
#define endl "\n"
using namespace std;

void Parse(string);

int main(){

int t;
cin>>t;

while(t>0){
        string s;

        cin>>s;

        Parse(s);

    t--;

}



return 0;


}
void Parse(string s){

if(s[0]== '#'){
    cout<< " Header file "<<endl;
}else if( s[0]=='(' || s[0]==')' || s[0]=='{' ||s[0]=='}' || s[0]==','|| s[0] == ';' ){
    char x = s[0];
    switch(x){

     case '(': cout<<" Left Paranthesis"<<endl ; break;
       case ')': cout<<" Right Paranthesis"<<endl ; break;
        case '{': cout<<" Open Brace"<<endl ; break;
         case '}': cout<<" Close Brace"<<endl ; break;
          case ',': cout<<" Comma  "<<endl ; break;
          case ';': cout<<" Semicolon   "<<endl ; break;


    // s[0]=='<'|| s[0]=='>' ||

           }

       }
  else if (s[0]=='<'|| s[0]=='>' || s[0]=='+'|| s[0]=='-' || s[0]=='='|| s[0]=='*' || s[0]=='/'|| s[0]=='%' )
  {

      cout<< " Operator " << endl;
  }
  else if (s == "int" || s == "char" || s == "double" || s == "while" || s == "auto" || s == "struct" || s == "break" ||
           s == "else" || s == "long" || s == "switch" || s == "case" || s == "enum" || s == "register" || s == "typedef" ||
           s == "extern" || s == "return" || s == "union" || s == "const" || s == "float" || s == "unsigned" || s == "short" ||
           s == "continue" || s == "for" || s == "signed" || s == "void" || s == "default" || s == "goto" || s == "sizeof" ||
           s == "volatile" || s == "do" || s == "if" || s == "static"   ){
    cout<< " KeyWord "<<endl;
  }
    else if (s[0]>= 65 && s[0]>= 90 || (s[0]>= 97 && s[0]<= 122) || s[0]== 95 ){
        cout<<" Valid Identifier "<<endl;
    }

    else {
        cout<< "Invalid Identifier or Token "<<endl ;
    }

}