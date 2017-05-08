//
//  TAExists.h
//  Design Framework
//
//  Created by Mahmoud Safar on 3/9/17.
//  Copyright © 2017 Mahmoud Safar. All rights reserved.
//

#ifndef TAExists_h
#define TAExists_h

#include <stdio.h>
#include <iostream>
#include <math.h>
#include <string>
#include "TAObjects.h"
#include "TASet.h"

using namespace std;

template <class T>
class TAExists : public TABool
{
    string name ="TAExists";
    TASet<T> *domain;
    TAExpression expression;
    
    public:
    
    TAExists( TASet<T> &D)
    {
        domain = &D;
    }
    
    TAExists(string x, TASet<T> &D)
    {
        name = x;
        domain = &D;
    }
    
    void setExpression(TAExpression e)
    {
        expression = e;
    }
    
    
    virtual bool evaluate()
    {
        vector<T> domain = domain->getDomainSet();
        int domainSize = domain.size();
        //domain has no elements hence the ForEvery function should normally return false because no x in D makes e(x) true.
        if (domainSize == 0)
        return false;
        else
        {
            for (int i = 0; i < domainSize; i++)
            {
                if ( expression.set(domain[i]) == true)
                {
                    return true;
                }
            }
            
            return false;
        }
    }
    
    
    
    
    
    
};






#endif /* TAExists_h */
