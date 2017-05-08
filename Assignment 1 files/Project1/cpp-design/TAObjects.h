//
//  TAObjects.h
//  EECE 437
//
//  Created by Mahmoud Safar on 3/9/17.
//  Copyright © 2017 Mahmoud Safar. All r**ights reserved.
//

#ifndef TAObjects_h
#define TAObjects_h

#include <stdio.h>
#include <iostream>
#include <math.h>
#include <string>


using namespace std;

class TAObject
{
    
    string type;
    string name;
    
    public:
    
    TAObject()
    {
    }
    
    string getType()
    {
        return type;
    }
    
};


class TABool : public TAObject
{
    //Attributes
    
    bool value;
    string name = "TABool"; //By default
    string type ="TABool";
    //TAObject *ptr = this;
    
    
    
    
    public:
    

    
    //Constructors
    TABool()
    {
        
    }
    TABool(string x){
        name = x;
        value = true;
        
    };
    
    
    //Methods
    
    void set ( bool x )
    {
        value = x;
    }
    
    virtual bool evaluate()
    {
        return value;
    }
    
    void printState()
    {
        cout << value << endl;
    }
    
    virtual void list()
    {
        cout << " " << name << " ";
        
    }
    
    
    
    
};




class TAInt : public TAObject
{
    protected:
    //Attributes
    int value;
    string name;
    public:
    
    //Contructors
    TAInt(){
        name = "int";
    };
    TAInt( string x )
    {
        name = x;
    }
    
    
    void set ( int x )
    {
        value = x;
    }
    virtual int evaluate()
    {
        //cout << "f" << endl;
        return value;
    }
    
    void printState()
    {
        cout << value << endl;
    }
    
    virtual void list()
    {
        cout << " " << name << " ";
        
    }
    
};



class TADouble : public TAObject
{
    protected:
    //Attributes
    double value;
    string name;
    public:
    //Contructors
    TADouble(){
        name = "double";
    };
    TADouble( string x )
    {
        name = x;
    }
    void set ( double x )
    {
        value = x;
    }
    virtual double evaluate()
    {
        
        return value;
    }
    
    void printState()
    {
        cout << value << endl;
    }
    
    virtual void list()
    {
        cout << " " << name << " ";
        
    }
    
};

//Dummy class
class TAExpression
{
    public:
    TAExpression(){};
    
    void set(TAObject x)
    {};
};

#endif /* TAObjects_h */
