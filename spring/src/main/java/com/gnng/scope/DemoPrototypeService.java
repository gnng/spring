package com.gnng.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")  //声明scope（范围）为prototype(原型)
public class DemoPrototypeService {

}
