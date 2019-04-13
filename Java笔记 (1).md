# Java笔记

## 基础

### 基本数据类型

#### 布尔型 boolean

#### 字符型 char

##### 转义字符

#### 整型

##### byte

##### short

##### int

##### long

###### 20 ==> 20L

#### 实数

##### float

###### 20.0 ==> 20.0f

##### double

#### 数据类型转换

##### 隐式转换

##### 显式转换

###### int a=(int) 'A';

#### 运算符

##### 算术运算符

###### + - * / %

##### 自增自减运算符

###### ++ --

##### 关系运算符

###### < <= > >= == !=

##### 逻辑运算符

###### && || ! ^

##### 位运算符

###### >> << & | ^ `

##### 三元运算符

###### a?b:c

#### 注释

##### 单行注释

###### //

##### 多行注释

###### /* */

##### 文档注释

###### /** */

### 数组

#### 基础

##### int[] a = new int[5]

##### int[] a = new int[]{1,2,3,4,5}

#### 操作

##### 填充

###### Array.fill()

##### 排序

###### Array.sort()

##### 复制

###### int[] a = Array.copyOf(b,5)

####### ==> 5 指复制后新数组的长度

###### int[] a = Array.copyOfRange(b,0,5)

####### ==> 复制b的[0,3)

##### 查询

#### 多维数组

### 字符串

#### 基础

##### 声明

##### 创建

#### 操作

##### 复制

##### 比较

###### str.compareTo(other str)

##### 替换

###### str.replace(old char,new char)

####### ==>String

##### 分割

###### str.split(sign)

####### ==>String[]

##### 截取

###### str.substring(int begin)

####### ==> String 从begin处截取到结尾

###### str.substring(int begin,int end)

##### 去除空格

###### str.trim()

####### ==> String 去除开始结尾空格

##### 查找与获取

###### 获取长度

####### str.length

###### 获取指定位置字符

####### str.charAt(index) ==> char 返回指定位置字符串

###### 查找

####### str.indexOf('a') ==> int "a"的首次出现的位置

####### str.lastIndexOf('a') ==> int "a" 最后出现的位置

##### 判断

###### str.startsWith("")

###### str.endsWith("")

###### str.equals(other str)

###### str.equalsIgnoreCase(other str)

##### 大小写转换

#### String.format()

#### StringBuffer类 缓冲器

##### length() 返回字符串长度

##### insert(index,str) 根据index进行插入str

##### append(str) 字符串末尾追加str

##### setCharAt(c,index)

##### indexOf(str) str在字符串中的index,没有返回-1

#### StringBulider类 生成器

### 程序控制语言

#### 顺序

#### 条件

##### if(){ }else if(){ }

#### 循环

##### while

###### do-while

##### for

###### for-each

#### 中断

##### continue

##### break

##### return

## 进阶

### 类

#### 基础

##### 定义

##### 修饰符

###### 访问权限

####### public 都可见

####### protect 同包可见

####### private 同类可见

###### static

####### 静态成员是属于类的

####### 即使没有对象也能调用

####### 生成对象共用静态成员

###### final

####### 修饰成员变量 变成常量

####### 修饰方法 方法不能被重写

####### 修饰类 类不能被继承

##### 主方法

###### public static void main(Stirng[] args){}

##### 构造方法

###### public Student(){}

##### 普通方法

###### public String print(){}

##### 成员变量

##### this

###### 调用这个函数的对象

#### 对象

##### 创建

##### 访问

#### Object类

##### 重写toString()

##### 重写equals()

##### getClass()

###### 返回对象执行时的Class实例

#### 垃圾回收

##### System.gc();

#### 判断实例属于某类

##### a instanceof b

###### ==>boolean a是b的实例

### 包装类

#### Number

##### Byte

##### Integer

##### Float

##### Double

##### Long

##### Short

#### Boolean

#### Character

### 特殊类

#### 抽象类

##### abstract

#### 接口

##### interface

#### 内部类

### 包

#### Package

#### import

### 继承

#### 继承类

##### extends 继承类 只能继承一个

#### 继承接口

##### implements 继承接口 可继承多个

### 多态

#### 重写

##### 子类继承父类,重写父类方法

#### 重载

##### 通过不同的形参表,区分同名的方法

### 常用类

#### 数字处理类

##### Math类 为数学计算提供方法

###### 常用常量

####### Math.PI

####### Math.E

###### 常用方法

####### 三角函数

######## double a = Math.PI*0.23

######## double b = Math.sin(a);

######## double b = Math.cos(a);

######## double b = Math.tan(a);

######## double b = Math.toRadians(a);//角度 --> 弧度

######## double b = Math.toDegree(a);//弧度 --> 角度

####### 指数函数

######## double b = Math.exp(a);//e^a

######## double b = Math.log(a);//log e a

######## double b = Math.log10(a);//log 10 a

######## double b = Math.sqrt(a);a^2

######## double b = Math.cbrt(a);a^3

######## double b = Math.pow(a,b);a^b

###### 取整函数

####### double b = Math.ceil(1.1);//2.0,大于1.1的最小整数

####### double b = Math.floor(1.1);//1.0,小于1.1的最大整数

####### double b = Math.rint(1.5);//2.0，最接近的整数，优先偶数

####### int b = Math.round(1.1);//2.0，1.1+0.5的最接近的整数

####### long b = Math.round(1.1);//强制转为long

###### 最大值，最小值，绝对值

####### Math.max(val);

####### Math.min(val);

####### Math.abs(val);

###### 随机数

####### Math.random()方法

######## double a = Math.random();//0 <= a < 1

##### Random类

###### int a = r.nextInt(int n);//返回随机int，小于n

###### Random r = new Random(seedval);//种子

###### Random r = new Random();

##### DecimalFormat 格式化数字

##### BigInteger 大整数

###### BigInteger b = new BigInteger(3);

###### BigInteger a = new BigInteger("23");

###### subtract();//减法

###### a.add(b);//加法

###### multiply();//乘法

###### divide();//除法

###### remainder();//取余

###### pow();//乘方

##### BigDecimal 大小数

#### Date

#### 获取系统时间

##### long time = System.currentTimeMills();//当前时间毫秒

## 高级

### 异常处理

#### try-catch 捕获异常

##### 异常被捕获后可继续运行

#### throws 声明方法会抛出异常

#### throw 手动抛出异常

#### Exception

### IO流

#### 字节流

##### 输入流

###### FileInputStream 文件字节输入流

####### 创建

######## String name

######## File file

####### 读取

######## in.read(byte[])

######### 读取至byte[]

###### ByteArrayInputStream 字节数组输入流

###### PipedInputStream 管道输入流

###### BufferedInputStream 缓冲输入流

####### 创建

######## InputStream in

######## InputStream in,int size

######### 带有size个字节的缓存流

###### FilterInputStream 过滤字节输入流

###### ObjectInputStream 对象输入流

###### DataInputStream 读取Java标准数据类型的输入流

##### 输出流

###### FileOutputStream

####### 创建

######## String name

######## File file

####### 写入

######## out.write(byte[])

######### 将byte[]写入流

###### ByteArrayOutputStream

###### PipedOutputStream

###### BufferedOutputStream

####### 创建

######## OutputStream out

######## OutputStream out,int size

######### 带有size个字节的缓存流

###### FilterOutputStream

###### ObjectOutputStream

###### DataOutputStream

###### PrintStream 含有print()和println()的输出流

#### 字符流

##### 输出流

###### FileWriter 文件字符输出流

###### CharArrayWriter 字符数组输出流

###### StringWriter 字符串输出流

###### PipedWriter 管道字符输出流

###### BufferedWriter 缓冲输出流

####### 创建

######## Writer wt

####### 写入

######## out.write(str)

####### 刷新

######## out.flush()

###### FilteredWriter 过滤字符输出流

###### InputStreamWriter 字节输出流转化为字符输出流

##### 输入流

###### FileReader 文件字符输入流

###### CharArrayReader 字符数字输入流

###### StringReader 字符串输入流

###### PipedReader 管道字符输入流

###### BufferedReader 缓冲输入流

####### 创建

######## Reader re

####### 读取

######## in.read()

######## in.readLine()

###### FilterReader 过滤字符输入流

###### InputStreamReader 字节输入流转化为字符输入流

#### zip压缩流

#### 文件类File

##### 创建和删除

###### File file = new File("D:/1.txt");//创建文件对象

###### file.creatNewFile();//创建文件

###### file.delete();//删除文件

###### file.exists();//文件是否存在

##### 文件信息

###### file.getName();

###### file.canRead();

###### file.canWrite();

###### file.exits();

###### file.length();

###### file.getAdsolutePath();

###### file.getParent();

###### file.isFile();

###### file.isDirectory();

###### file.Hidden();

###### file.lastModified();

### 反射

#### 使用Class类

##### Class clazz = Class.forName("包名.类名");

##### Class clazz = Student.getClass();

#### 创建对象

##### 获取构造方法

###### Constructor cons = clazz.getConstructor(String.class,String.class)

##### 调用构造方法

###### Student stu = cons.newInstance("name","age")

#### 成员变量

##### 私有成员变量

###### 获取参数

####### Field f = clazz.getDeclaredField(参数名)

###### 取消访问检查

####### f.setAccessible(true)

###### 使用变量

####### f.get() 获取值

####### f.set() 赋值

##### 通过对象调用 stu.name

#### 成员方法

##### 私有成员方法

###### 获取方法

####### Method m=clazz.getDeclaredMethod(方法名,形参表)

###### 取消访问检查

####### m.setAccessible(true)

###### 调用方法

####### m.invke(stu,实参)

##### 通过对象调用 stu.getName()

#### 注解

### 线程

#### 创建线程

##### Thread

###### 继承Thread

###### 重写run()

###### 实例化

###### 调用start()

##### Runnable

###### 继承Runnable接口

####### MyRunnable implements Runnable

###### 重写run()

###### 实例化Runnable

####### MyRunnable r = new MyRunnable()

###### 实例化Thread

####### Thread t = new Thread(r)

###### 调用start()

####### t.start()

#### 线程状态

##### new Thread() 出生

###### t.start() 就绪

####### 获取电脑资源 执行

######## 时间片结束 返回就绪

######## t.wait() 等待

######### t.notify() or t.notifyAll() 返回就绪状态

######## t.sleep(time) 休眠

######### 时间结束 返回就绪

######## 阻塞

######## 死亡

##### 让步

###### Thread.yield()

##### 插入

###### t.join()

#### 优先级

##### t.setPriority(int)

#### 同步

##### 方法

###### synchronized

##### 块

###### synchronized(变量){}

#### 线程组

#### 线程池

### 正则

#### 使用

##### 创建Pattern

###### Pattern p = Pattern.compile(RegStr)

##### 创建Matcher

###### Matcher m = p.matcher(String)

#### Reg String

##### 字符集

###### 标准

####### \d 任意一个数字[0-9]

####### \D 非\d

####### \w 任意一个字母数字下划线[0-9][a-z][A-Z][_]

####### \W 非\w

####### \s 空格 制表符 换行符

####### \S 非\s

####### . 任意一个字符

###### 自定义

####### [369] 匹配369中的一个

####### [^369] 非[369] 取反

####### [0-9] 匹配0-9中的一个字符

##### 量词 默认贪婪 量词之后加? 关闭贪婪

###### {n,m} 匹配最少n次，最多m次

###### {n,} 匹配最少n次

###### ？ ==>  {0.1}

###### +  ==>  {1,}

###### *  ==>  {0,}

##### 选择和分组

###### | 分支结构 匹配左侧或者右侧

###### () 捕获组

###### (?:) 非捕获组

### 容器

#### List

##### ArrayList

##### LinkedList

#### Set

##### HashSet

##### TreeSet

##### LikedHashSet

#### Map

##### HashMap

##### SortedMap

### 泛型和枚举

#### 枚举

##### public enum name{}

#### 泛型

##### 定义

###### public class name<T>{}

###### LinkedList<String> a = new LinkedList<String>()

##### 限制泛型可用类型

##### 泛型通配符

## 应用

### JDBC

#### JDBC设计

##### 确定加载驱动

###### Class.forName("com.mysql.jdbc.Driver")

##### 连接数据库

###### Connection con = DriverManager.getConnection("jdbc:mysql://"+database-name+userName+pwd)

##### 操作数据库

###### Statement类

####### 创建

######## Statement sql = con.createStatement()

####### 获取查询结果集

######## ResultSet res = sql.executeQuery("select * from table")

####### 循环读取

######## while(res.next()){res.getString("name")}

###### prepareStatemet类

####### 创建

######## prepareStatement sql = con.prepareStatement("select * from table where id = ?")

####### 设置参数

######## sql.setInt(1,2)

######### 一号位设置为2

####### 获取结果

######## ResultSet res = sql.executeQuery()

###### 修改数据库

####### sql.executeUpdate() 无返回值

##### 关闭连接

### 网络编程

#### TCP

##### TCPServer

###### ServerSocket类

####### 创建套接字

######## ServerSocket s = new ServerSocket(int port)

####### 创建流

####### 等待连接

######## Socket socket = s.accept()

##### TCPClient

#### UDP

##### 发送数据包

###### 创建套接字

####### socket = new DatagramSocket()

###### 创建数据包

####### pack = new DatagramPacket(byte[],int length,InetAddress IP,int port)

###### 发送数据包

####### socket.send(pack)

##### 接收数据包

###### 创建套接字

####### socket = new DatagramSocket(port)

###### 创建字节数组接收数据包

####### pack = new DatagramPacket(byte[],int length)

###### 接收数据包

####### socket.receive(pack)

#### IP

##### InetAddress类

###### 获取

####### InetAddress ip = InetAddress.getByName(host);

###### 获取信息

#### Socket

#### URL

### 图形界面

#### 基础

##### 容器

###### Frame 窗体

###### Panel 面板

##### 组件

###### Button 按钮

###### Label 标签

###### Checkbox 复选框

###### TextField 文本域

###### TextArea 多行文本域

###### List 列表

##### 布局管理器

###### 网格布局

####### new GridLayout(3,4) ==> 三行四列依序添加

###### 顺序布局

####### new FlowLayout()

###### 边界布局

####### new BorderLayout() 五个方向 不可重复指定 否则会覆盖

###### 卡片布局

####### new CardLayout()

#### Swing

##### 组件

###### JButton

###### JCheckbox

###### JRadioButton 单选按钮

####### 与ButtonGroup配合使用

###### JComboBox 组合框

###### JTable 表格

###### JTree 树

###### JTextField 文本框

###### JList 列表

###### JPasswordField 密码框

##### 窗体

###### JFrame

####### f.setSize();//设定尺寸

####### f.setTitle();//设置标题

####### f.setVisible();//设定可见性

####### f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设定退出方式

####### f.setBound(int,int,int,int);//设定位置大小

####### f.setLayout();//添加布局管理器

###### JPanel

###### JDialog 对话框

###### JOptionPane 快速对话框

####### JOptionPane.showMessageDialog(null,string);//弹出确定对话框

##### 事件处理

###### 事件类

####### 低级事件

######## 组件事件

######## 容器事件

######## 窗口事件

######### WindowListener

######## 焦点事件

######### FocusListener

######## 键盘事件

######### KeyListener

######## 鼠标事件

######### MouseListener

####### 高级事件

######## 动作事件

######### ActionListener actionPerfomed()

######## 调整事件

######### AdjustmentListener

######## 项目事件

######### ItemListener

######## 文本事件

###### 事件适配器 更加简洁

####### ComponentAdapter

####### ContainerAdapter

#### 绘图

### 打印技术

## 扩展

### MySQL

#### 连接服务器

##### mysql -uroot -p1234

#### 数据库

##### 查看库

###### show databases

##### 选库

###### use 库名

##### 创建库

###### create database 库名 [charset utf8]

##### 删除库

###### drop database 库名

#### 表

##### 表本身

###### 删除

####### drop table 表名

###### 查找

####### 查看所有表

######## show tables

####### 显示表的结构

######## desc 表名

####### 查看建表语句

######## show create table 表名

###### 修改

####### 改名

######## rename table 旧名 to 新名

######### alter table 表名 change 旧列名 新列名 新参数

####### 加列

######## alter table 表名 add id int;

######### alter table 表名 add 列名 列参数 [after 某列][first]

####### 删除列

######## alter table 表名 drop 列名

####### 修改列类型

######## alter table 表名 modify 列名 列参数

###### 创建

####### create table 表名(列名 列类型 说明,...)engine 引擎名 charset utf8;

######## 列类型

######### 整形

########## Tinyint 1字节 -128-127 or 0-255 

########## Smallint 2字节

########## Mediuint 3字节

########## int 4字节

########## bigint 8字节

########## 参数

########### (m) 补零宽度

########### zerofill 不够位用0填充

########### unsigned 无符号

######### 浮点型

########## float(m,d) m精度(存储值的主要位数，总位数) d标度(小数点后的位数)

########## decimal(m,d) 定点型

######### 字符型

########## char(n) 定长字符串

########## varchar(n) 变长字符串

######### text 文本类型

######### blob 二进制信息

######### 时间类型

########## date 日期 0000-00-00

########## time 时间 00:00:00

########## datetime 日期时间 0000-00-00 00:00:00

########## year 年份 1901-2155

########## timestamp 时间戳 CURRENT_TIMESTAMP 当前时间常量

######## 说明

######### not null default '',//默认值

######### auto_increment,//自增长

######### primary key//主键

######## 引擎名

######### myisam

######### inndb

######### bdb

######### memory

######### archive

###### 复制

####### 库名.表名 select 表头 from 库名.表名 //复制其他表

##### 表中的数据

###### 增加

####### insert into 表名 [(name,id)]values ("x",1),("y",2);

###### 删除

####### delete from 表名 where id = 3;

####### 清空

######## truncate 表名

###### 修改

####### updata 表名 set name = "" where [id = 3 and ]//表达式;

###### 查找

####### 语法

######## order by id desc,name desc//结果排序 desc 降序 asc 升序

######## having boolean条件//结果筛选

######## group by id //分组求和

######## where id like '1%' //模糊查询 % 匹配任意字符 _ 匹配一个字符

######## select (表头) from 表名 where boolean条件 (等于为=)

######## limit [n]m//结果限制条数 n 跳过几行 m 显示几行

####### 子查询

######## where 型

######### select id from 表名 where id = (select max(id) from 表名);

######### where id in (select max(id) from 表名 group by name);

######## from 型

######### select id from (select max(id) from 表名 group by name) as big where id >1  ;

######## exist型

######### select id from 表名 where exist (select id from 表名 where id = ?//不为空);//存在

####### 全相乘

######## select * from 表1，表2;//表1，表2进行笛卡尔积

######## select 表1.id 表2.id from 表1，表2 where 表1.id = 表2.id;

####### 左连接

######## select * from 表1 left join 表2 on 连接条件

######## 表1 left join 表2 ==> 表2 right join 表1

######## select * from 表1 inner join 表2 on 连接条件

####### union

######## select * from 表1 union select * from 表2

######## union all//不去重

####### 视图

######## create view 视图名 as select语句

######## create algorithm=merge view 视图名 as select语句

######### algorithm

########## temptable //建临时表

########## merge //合并查询语句

########## undefined //系统决定

### XML

#### 语法

##### 声明

###### <?xml version="1.0" encoding="UTF-8"?>

##### 元素

###### <name>xiao</name>

###### 拥有属性

####### <name id="1" type="String">xiao</name>

##### 注释

###### <!-- this is a note -->

##### 命名空间

#### 规定xml的格式

##### DTD 

##### Scheme

#### Java 读取 xml

##### JAXP

###### DOM

###### SAX

### Web

#### html

#### css

#### JavaScript

### JavaMail

## Java EE

### Servlet

#### 生命周期

##### 装载Servlet

##### 创建Servlet实例

##### 第一次生成实例 会调用 实例的init() 进行初始化

##### 创建ServletRequest 和ServletResponse 对象 分别代表客户端的请求和响应

##### 调用实例的 service(ServletRequest,ServletResponse)方法

##### serivce()方法根据request,处理response

##### destroy() 与init()一样 只调用一次

#### 编写Servlet

##### 继承 implements Servlet

###### init()

###### service()方法

####### 传入参数

######## service(ServletRequest request,ServletResponse response)

####### 获取客户端信息

####### 获取输出流

######## PrintWriter out = response.getWriter();

####### 写入信息

######## out.print("<html></html>")

###### destory()

##### 继承 implements HTTPServlet

###### doGet(req,res)

###### doPost(req,res)

###### 内置对象

####### HttpServletRequest request

######## req.setCharacterEncoding("UTF-8")

######### 设置请求的字符集

######## req.getParameter(String name)

######### ==> String 指定参数的值

######## req.getParameterValues(String name)

######### ==>String[]

######## req.getMethod()

######### ==>String "GET" or "POST"

####### HttpServletResponse response

######## res.setContentType("text/html;charset=UTF-8;")

######### 设置响应字符集

######## PrintWriter out = response.getWriter();

######## out.println("<html>")

######### 向客户端输出

### JSP

#### JSP会翻译成servlet 由一大堆 out.print("")语句组成

#### 指令元素

##### page指令

###### <%@page import="java.io.*,java.util.*"%>

####### 引入包

###### session="true"

####### 参与HTTP会话 获得 session 对象

###### contentType="text/html;charset=UTF-8"

###### errorPage="error.jsp"

####### 当页面出现未被捕获的错误 会跳转到 error.jsp

###### isErrorPage="true"

####### <%=exception.getMessage()%>取得错误信息

##### include指令

###### <%include file="hello.inc"%>

####### 引入文件

##### taglib指令

###### 指明页面使用的标签库

#### 脚本元素

##### 声明

###### <%!  int i=0;     %>

###### <%! public int getAge(){ return age; } %>

##### 表达式 简化的 out.print()

###### <%= "hello"%>

##### 脚本

###### <% if(a==0)out.print("hello")  %>

##### 注释

###### <%-- 注释 --%>

#### 标准动作元素

#### 内置对象

##### request

###### HTTPServletRequest类 包含请求的信息

##### response

###### HttpServletResponse类 对请求的响应

##### out

###### PrintWriter类 由response.getWriter()获得 使用此对象将内容输出到页面

##### session

###### HttpSession 传递客户会话信息

##### pagecontext

##### application

##### config

##### page

##### exception

#### JSTL 标准标签库

### JavaBean

#### 规范 符合规范就是javaBean类

##### 类 非抽象 是公共的

##### 具有无参构造器

##### 提供符合一致性设计模式的公共方法

## 框架

### 介绍

#### web

##### Struts web开发框架

###### 组成

####### 模型 Model

######## javabean

####### 视图 View

######## jsp

####### 控制器 Controller

######## servlet

###### 配置

####### web.xml

####### Struts-config.xml

##### Spring MVC

#### SSM+Redis

##### Spring

###### Ioc

####### 资源管理,整合,即插即拔功能

###### AOP

####### 切面管理,数据库事务管理

##### SpringMVC

###### 模型,视图,控制器分层

##### Mybatis

###### 数据库访问的持久层

##### Redis

###### 缓存工具

#### 数据库

##### Hibernate 访问数据库

##### NoSQL

###### Redis

##### MyBatis 代替Hibernate

### MyBatis

#### 核心组件

#### 配置

#### 映射器

#### 动态SQL

#### 解析运行原理

#### 插件

### Spring

#### 理念

##### IoC 控制反转

##### AOP 面向切面编程

#### 基础

##### IoC概念

##### 装配Spring Bean

##### 面向切面编程

##### 分支主题

##### Spring+数据库

##### Spring数据库事务管理

### SpringMVC

### Redis

## 设计模式

### 动态代理模式

#### JDK动态代理

#### CGLIB

### 责任链模式
