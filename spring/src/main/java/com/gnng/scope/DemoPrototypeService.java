package com.gnng.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")  //����scope����Χ��Ϊprototype(ԭ��)
public class DemoPrototypeService {

}
