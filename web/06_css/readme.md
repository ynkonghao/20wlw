### 三、盒子模型

画图讲解

设置的方式如下代码
```css
#parent {
  border:1px solid red;
  width:500px;
  height:400px;
}
#child {
  border:1px solid green;
  width:200px;
  height:200px;
  /*上下左右都是10px*/
  /* padding:10px; */
  /*上下20px，左右50px*/
  /* padding:20px 50px; */
  /*上左下右*/
  padding:20px 0px 0px 100px;
  margin:20px 0px;
}
#parent {
  padding-top:20px;
}
```
需要注意的是不能使用padding或者margin来设置文本居中，如果只是想简单的实现文本居中，不要设置容器的宽和高
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>盒子模型</title>
  <style>
    #parent {
      border:1px solid red;
      width:500px;
      height:400px;
    }
    #child {
      border:1px solid green;
      width:200px;
      height:200px;
      /*上下左右都是10px*/
      /* padding:10px; */
      /*上下20px，左右50px*/
      /* padding:20px 50px; */
      /*上左下右*/
      padding:20px 0px 0px 100px;
      margin:20px 0px;
    }
    #parent {
      padding-top:20px;
    }
    /*如果不设置宽和高，直接设置padding，文本会在padding设置的位置*/
    span.s1 {
      border:1px solid #aaa;
      padding:10px 20px;
    }
    #d3 {
      border:1px solid #aaa;
      height:50px;
      width:150px;
      margin:40px;
      /* padding-top:25px;padding的高度是不会计算在height里面的，也就意味着，总高度是height+padding
         如此就会导致容器的总高度变高。所以没有办法使用padding来进行文本的对齐
      */
    }
  </style>
</head>
<body>
  <div id="parent">
    <div id="child">hello world</div>
  </div>
  <span class="s1">测试1</span><span class="s1">测试2</span><span class="s1">测试3</span><span class="s1">测试4</span><span class="s1">测试5</span><span class="s1">测试6</span>
  <div id="d3">
    我的导航
  </div>
</body>
</html>
```

### 四、定位
在css中使用top,left,right,bottom来精确设定一个容器的位置，默认情况是不行，需要通过设定position来改变具体的定位方式，position有如下一些值
- static 
表示静态的，也是默认情况，这种定位类型不允许设置top这些值。
- relative
表示相对定位，设置了relatvie，会相对于自己的父类进行位置设置
```css
#child {
  height:200px;
  width:200px;
  border:1px solid green;
  /*相对于parent设置位置*/
  position: relative;
  top:20px;
  left:40px;
}
```
- absolute
表示绝对定位，设置了absoulte之后，会去找上一级设置了position为（absoulte或者relatvie）的父节点进行定位

- fixed
固定在某个位置
```css
/*固定在顶部*/
#top {
  padding:20px;
  border:1px solid #aaa;
  position: fixed; 
  top:0px;
  width: 100%;
}
#right {
  position: fixed;
  right:10px;
  top:50%;
}
#bottom {
  position: fixed;
  bottom:20px;

}
```
在有个定位的知识之后，就可以完成文本精确定位了，如果一个容器设置了宽和高，此时不能使用padding和margin，需要为文本增加一个span标签
```html
<div class="nav">
  <span>测试定位</span>
</div>
```
之后为span标签编写相应的定位样式
```css
div.nav {
  /*容器中的子容器居中*/
  text-align: center;
}
div.nav span {
  position: relative;
  /* left:10px; */
  top:12px;
}
```
### 五、float
float可以将占满一行的容器向某个方向排列，如果使用`float:left`就会向左排列，使用float需要注意的几个点
- 使用了float之后不会再占用空间
使用了float之后，子容器不会占有父容器的空间，此时父容器就没有高度，需要在子容器的最后增加clear，清除两边的漂移
此时需要特别注意，如果使用的是子类选择符，由于加载比较慢，clear不会起作用，所有需要使用类选择器来处理
```html
<ul id="nav">
  <li class="nav_li">导航信息1</li>
  <li class="nav_li">导航信息2</li>
  <li class="nav_li">导航信息3</li>
  <li class="nav_li">导航信息4</li>
  <li class="nav_li">导航信息5</li>
  <li class="clear"></li>
</ul>
```
```css
*.clear {
  clear:both;
  list-style:none;
}
#nav {
  border:1px solid red;
}
li.nav_li{
  list-style: none;
  float:left;
  border:1px solid #aaa;
  padding:10px 25px;
}
```
- 如果float的容器总宽度小于父容器的宽度，会自动换行
float的所有容器的宽度如果小于父容器的总宽度会换行，需要特别注意，边框，padding，margin都会加载子容器的宽度中，建议父容器的宽度稍微宽一些（子容器的宽度稍微窄一些）