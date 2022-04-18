### 选择器

#### 标签选择器
直接使用标签名称做选择
```css
div {
  color:red;
}
```
#### ID选择器

为页面中某一个唯一标签编写样式，首先需要为标签增加id属性之后在样式中通过#来编写
```html
<!--一个网页中id是不建议重复的，是唯一标识-->
<div id="d1">
  我是一个容器
</div>
```
```css
 /*为id为d1容器写样式*/
  #d1 {
    font-size:22px;
    color:#090;
  }
```
在标签选择器之后加载

#### 类选择
为页面中的一组标签添加样式，首先为标签增加class属性，之后使用.来引用
```html
<div class="c1">
  我还是一个容器
</div>
<div class="c1">
  我依然是一个容器
</div>
```
```css
/*为网页中class为c1的标签写样式*/
div.c1 {
  border:1px solid red;
}
```
#### *号选择器
满足页面中的所有标签，但是是所有选择器中最先加载的，只要有任意一个标签写了相同的样式，都会被覆盖

#### 子类选择器
可以为标签中的子标签编写样式，有两种写法`p c`和`p > c`，前者表示父类(p)中的所有c标签，后者表示父类的第一级的c
```css
/*子类选择器，为ul中的所有li编写样式*/
ul li {
  list-style:none;
  color:#933;
}
/*ul中的所有span，不管多少级都能匹配*/
/*ul span {
  background:#aaa;
  color:#f00;
}*/
/*只为ul中的第一级的span添加样式*/
ul > span {
  background:#aaa;
  color:#f00;
}
```
特别注意的是子类选择器在所有选择器最后加载,如如下实例
```html
<ul class="c1" id="u1">
  <span>还是说明</span>
  <li class="l1">列表1</li>
  <li class="l1">列表2<span>说明</span></li>
  <li class="l1">列表3</li>
  <li class="l1">列表4<span>说明</span></li>
  <li class="l1">列表5</li>
</ul>
```
li的样式有两种方式可以添加，一种使用`#u1 li`另外一种使用`li.l1`，此时前者会后加载
```css
#u1 li {
  list-style:none;
  color:#933;
}

li.l1 {
  color:#009;
}
```
最终的颜色是#933，如果要完成覆盖，需要写更高级别的基于id的子类。

#### 伪类选择器
使用`:`进行选择，常用的选择有:
- `:link`：点击链接之前，主要针对超链接
- `:hover`：鼠标移动上去的连接，针对所有标签
- `:visited`：链接点击之后的样式，针对超链接
- `:nth-child`：子类选择器

```html
<a href="#t12" class="link">测试内容1</a>
<a href="#t23" class="link">测试内容2</a>
<a href="#t34" class="link">测试内容3</a>
<a href="#t45" class="link">测试内容4</a>
<a href="#t56" class="link">测试内容5</a>
```

```css
/*超链接的默认情况*/
/*使用,表示两个选择器同时使用一个样式*/
a.link:link, a.link:visited {
  text-decoration: none;
  color:#373;
}
/*鼠标移动上去的情况*/
a.link:hover {
  text-decoration: underline;
  color:#933;
}
/*点击过后的情况*/
/*a.link:visited {
  color:#5b5;
}*/
```

``` css
#u2 li:hover {
  background:#eee;
}
/*
nth-child(2)表示第二节点
nth-child(even)所有的偶数节点，odd所有的奇数节点
*/
#u2 li:nth-child(even) {
  background: #393;
  color:#fff;
}
```