## CSS的基础
#### 一、CSS的基本语法和编写方式

CSS的基本语法是通过键值对的方式，`css的类型:值`，`font-size:13px`,如果有多个样式，使用`;`进行分割

css可以通过三种方式编写
- 编写在标签中
在标签中使用style属性进行设置
```html
<div style="font-size:22px;color:#921">这是一个容器</div>
```
这种方式的特点是，仅仅只为一个标签编写样式，其他标签没有用
- 编写在head的style标签中
```html
<style>
  /*为网页中的所有div标签编写样式*/
  div {
    font-weight:bold;
  }
</style>
```
样式的加载是有顺序的，后加载的会把先加载的覆盖掉。在标签中通过`style属性`设置的样式，是最后加载.
- 编写成独立的文件
文件的类型是.css,编写了css文件之后，需要在网页中添加这个css的引用
main.css如下
```css
div {
  background: #eee;
}
```
在html中需要通过link标签进行引入
```html
<link rel="stylesheet" href="main.css"/>
```
使用link引入的样式的加载顺序要和`style标签`进行判断，哪个在前就先加载哪一个，但是在style属性中写的样式，永远最后加载。

#### 二、常用样式

- 文本样式
常用的文本样式如下:
```html
<style>
  div {
    font-size:20px;/*字体大小，可以使用em或者px*/
    color:#393;/*设置颜色*/
    font-weight: bold;/*字体加粗*/
    font-style: italic;/*斜体*/
    font-family: 楷体;/*字体类型*/
    /*
    text-decoration表示字体修饰
        none:默认情况，什么都不做
        underline:下划线（超链接默认就有下划线）
        line-through:中滑线
    */
    text-decoration: line-through;
  }
  p {
    text-indent: 30px;/*段落缩进,字体大小的改变会影响缩进*/
    /* font-size:25px; */
    line-height: 25px; /*行高*/
    letter-spacing: 1px;/*字符间距*/
  }
</style>
```
- 容器样式
常用的容器样式有，宽高，边框和背景
```html
<style>
  div {
    /*
    border用来设置边框，值的写法需要按照如下顺序写
        第一个是边框的粗细
        第二个是边框的类型:solid(实现框),dotted(点线框),dashed(虚线框)
        通过以下的代码，边框的四个方向都有值
    */
    border:1px dashed #aaa;
    border:none;
    border-bottom: 1px dashed #999;
    border:1px solid #999;
    width:260px;/*设置宽度，需要注意，div就是宽度没有网页宽，也占据一行*/
    height:260px;/*设置高度*/
    border-radius: 10px;/*圆角半径*/
    /*
    background用来编写背景，编写的方式和border类似
        第一个是颜色
        第二个是图片使用url加载（一般用相对路径）
        第三个是图片的重复方式:no-repeat表示不重复，repeat表示重复(默认)，repeat-x,repeat-y
    */
    background: #eee url(01.png) no-repeat;
    /*可以通过background-position写图片的位置，第一个是左右，第二个是上下，如果只写一个表示上下左右的共同值*/
    background-position: 50% 20px;
  }
</style>
```