# hibernate_many2many_uni
关系映射——多对多的单向关联

需要注解： @ManyToMany

如果想要指定生成的中间表的名字，以及生成的主键的名字，需要在@ManyToMany注解下面加上注解：

@JoinTable（
        name="中间表的名字",
        
        //这里的joinColumns是作为属性出现，写法不同于注解@JoinColumns，但是意义和用法一样。
        
        joinColumns={@JoinColumn(name="知道另一个类的这方的主键更名")}，
        
        inverseJoinColumns={@JoinColumn(name="被知道方的主键更名")}
）
