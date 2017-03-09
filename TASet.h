//
//  TASet.h
//  EECE 437
//
//  Created by Mahmoud Safar on 3/9/17.
//  Copyright © 2017 Mahmoud Safar. All rights reserved.
//

#ifndef TASet_h
#define TASet_h

#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>


using namespace std;

template <class T>
class TASet
{
    
    vector<T> objPool;
    string domainSetName = ""; // This is the Set Name
    
    public:
    
    TASet(string name)
    {
        domainSetName = name;
    };
    
    
    
    void addObjectToPool (T &object)
    {
        objPool.push_back(object);
    }
    
    vector<T> getDomainSet()
    {
        return objPool;
    }
    
};

#endif /* TASet_h */
