<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover">
    <meta name="theme-color" content="#FF5A2E">
    <title>味达外卖 · 首页</title>
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
<div class="phone">
    <!-- 顶部：定位 + 搜索 -->
    <header class="header">
        <div class="header__row">
            <a class="loc" href="#">
                <svg class="loc__pin" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round" stroke-linejoin="round">
                    <path d="M12 21s6.5-5.6 6.5-10.5a6.5 6.5 0 0 0-13 0C5.5 15.4 12 21 12 21Z"/>
                    <circle cx="12" cy="10.4" r="2.5"/>
                </svg>
                <span class="loc__text">
            <b>望京 SOHO</b>
            <i>北京市朝阳区望京街 10 号</i>
          </span>
                <svg class="loc__arrow" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                    <path d="m8 10 4 4 4-4"/>
                </svg>
            </a>
            <a class="logout" href="login.jsp">退出</a>
        </div>

        <div class="search">
            <svg class="search__icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round">
                <circle cx="11" cy="11" r="6.6"/>
                <path d="m16 16 4.2 4.2"/>
            </svg>
            <input type="text" placeholder="搜索 奶茶 / 炸鸡 / 麻辣烫">
            <button class="search__btn" type="button">搜索</button>
        </div>
    </header>

    <main class="main">
        <!-- 活动横幅 -->
        <section class="banner">
            <img class="banner__img"
                 src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=abundant%20chinese%20hot%20dishes%20feast%20on%20wooden%20table%20steaming%20warm%20sunlight%20food%20photography&image_size=landscape_16_9"
                 alt="美食活动">
            <div class="banner__mask"></div>
            <div class="banner__text">
                <span class="banner__tag">新人专享</span>
                <h2>首单立减 20 元</h2>
                <p>注册即领 · 今日 24 点前有效</p>
                <a class="banner__btn" href="#">立即领取</a>
            </div>
        </section>

        <!-- 分类入口 -->
        <nav class="cats">
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--food">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <path d="M3.5 11.5h17a8.5 8.5 0 0 1-17 0Z"/>
              <path d="M8 19.5h8"/>
              <path d="M16.8 4.5 19.2 10"/>
            </svg>
          </span>
                <span class="cat__name">美食</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--dessert">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <path d="M7.8 11.6h8.4L12 21z"/>
              <path d="M7.8 11.6a4.2 4.2 0 0 1 8.4 0"/>
              <path d="M12 7.4V4.6"/>
            </svg>
          </span>
                <span class="cat__name">甜品</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--market">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <path d="M5.5 8h13l-1.1 12h-10.8z"/>
              <path d="M9 8V6.4a3 3 0 0 1 6 0V8"/>
            </svg>
          </span>
                <span class="cat__name">超市</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--fruit">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <path d="M12 7.6c-4-2.6-6.6.3-6.6 3.7 0 3.2 2.5 8.4 4.3 8.4.9 0 1.4-.5 2.3-.5s1.4.5 2.3.5c1.8 0 4.3-5.2 4.3-8.4 0-3.4-2.6-6.3-6.6-3.7Z"/>
              <path d="M12 7.6V5.2A2.6 2.6 0 0 1 14.6 2.6"/>
            </svg>
          </span>
                <span class="cat__name">水果</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--drug">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <rect x="4" y="9.2" width="16" height="5.6" rx="2.8" transform="rotate(-45 12 12)"/>
              <path d="m9.4 9.2 5.4 5.4"/>
            </svg>
          </span>
                <span class="cat__name">药品</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--run">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <circle cx="6" cy="17" r="2"/>
              <circle cx="18" cy="17" r="2"/>
              <path d="M6 17h7l2.2-7H19"/>
              <path d="M10 10h5"/>
            </svg>
          </span>
                <span class="cat__name">跑腿</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--coffee">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
              <path d="M5 9h11v4.6A5.4 5.4 0 0 1 10.6 19h-0.2A5.4 5.4 0 0 1 5 13.6z"/>
              <path d="M16 10.4h1.6a2.6 2.6 0 0 1 0 5.2H16"/>
              <path d="M7.4 4.6v2M11 4.6v2"/>
            </svg>
          </span>
                <span class="cat__name">咖啡</span>
            </a>
            <a class="cat" href="#">
          <span class="cat__icon cat__icon--all">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linejoin="round">
              <rect x="4" y="4" width="6.6" height="6.6" rx="1.9"/>
              <rect x="13.4" y="4" width="6.6" height="6.6" rx="1.9"/>
              <rect x="4" y="13.4" width="6.6" height="6.6" rx="1.9"/>
              <rect x="13.4" y="13.4" width="6.6" height="6.6" rx="1.9"/>
            </svg>
          </span>
                <span class="cat__name">全部</span>
            </a>
        </nav>

        <!-- 限时秒杀 -->
        <section class="block">
            <div class="block__head">
                <h2>限时秒杀</h2>
                <span class="countdown">02 : 14 : 36</span>
                <a class="block__more" href="#">更多 ›</a>
            </div>
            <div class="flash">
                <a class="flash-item" href="#">
                    <img src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=crispy%20fried%20chicken%20with%20sesame%20close%20up%20dark%20background%20food%20photography&image_size=square_hd" alt="香辣炸鸡">
                    <p class="flash-item__name">脆皮炸鸡桶</p>
                    <p class="flash-item__price"><em>¥</em>19.9<span>¥39.9</span></p>
                </a>
                <a class="flash-item" href="#">
                    <img src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=brown%20sugar%20bubble%20milk%20tea%20in%20clear%20cup%20with%20ice%20dark%20background%20product%20photo&image_size=square_hd" alt="黑糖珍珠奶茶">
                    <p class="flash-item__name">黑糖珍珠奶茶</p>
                    <p class="flash-item__price"><em>¥</em>6.6<span>¥15.0</span></p>
                </a>
                <a class="flash-item" href="#">
                    <img src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=fresh%20salmon%20sushi%20platter%20on%20black%20slate%20top%20view%20japanese%20cuisine&image_size=square_hd" alt="三文鱼寿司">
                    <p class="flash-item__name">三文鱼双人餐</p>
                    <p class="flash-item__price"><em>¥</em>49.9<span>¥88.0</span></p>
                </a>
            </div>
        </section>

        <!-- 附近好店 -->
        <section class="block">
            <div class="block__head">
                <h2>附近好店</h2>
                <span class="sort">综合排序⌄</span>
            </div>

            <div class="shops">
                <article class="shop">
                    <img class="shop__img"
                         src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=braised%20chicken%20rice%20bowl%20close%20up%20with%20steam%20dark%20rustic%20table%20appetizing%20food%20photography&image_size=square_hd"
                         alt="黄焖鸡米饭">
                    <div class="shop__body">
                        <h3>老灶黄焖鸡米饭</h3>
                        <p class="shop__meta"><b>★ 4.9</b> 月售 2000+ · 25 分钟</p>
                        <p class="shop__tags"><i>满 30 减 15</i><i>新客立减</i></p>
                        <p class="shop__foot"><span class="shop__price"><em>¥</em>18.8 起</span><span class="shop__dis">2.3km · 配送 ¥3</span></p>
                    </div>
                </article>

                <article class="shop">
                    <img class="shop__img"
                         src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=gourmet%20double%20cheese%20burger%20with%20lettuce%20on%20wooden%20board%20dark%20background%20studio%20light&image_size=square_hd"
                         alt="芝士牛肉汉堡">
                    <div class="shop__body">
                        <h3>BURGER LAB 手工汉堡</h3>
                        <p class="shop__meta"><b>★ 4.8</b> 月售 1200+ · 30 分钟</p>
                        <p class="shop__tags"><i>第二份半价</i><i>准时宝</i></p>
                        <p class="shop__foot"><span class="shop__price"><em>¥</em>26.0 起</span><span class="shop__dis">1.6km · 配送 ¥2</span></p>
                    </div>
                </article>

                <article class="shop">
                    <img class="shop__img"
                         src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=fresh%20avocado%20salad%20bowl%20with%20cherry%20tomato%20top%20view%20on%20light%20marble&image_size=square_hd"
                         alt="牛油果沙拉">
                    <div class="shop__body">
                        <h3>绿野轻食沙拉</h3>
                        <p class="shop__meta"><b>★ 4.7</b> 月售 860+ · 20 分钟</p>
                        <p class="shop__tags"><i>满 50 减 20</i><i>0 元配送</i></p>
                        <p class="shop__foot"><span class="shop__price"><em>¥</em>22.5 起</span><span class="shop__dis">0.9km · 免配送费</span></p>
                    </div>
                </article>
            </div>
        </section>
    </main>

    <!-- 底部导航 -->
    <nav class="tabbar">
        <a class="tab tab--active" href="home.jsp">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round" stroke-linejoin="round">
                <path d="M4 10.8 12 4l8 6.8V19a1.4 1.4 0 0 1-1.4 1.4H5.4A1.4 1.4 0 0 1 4 19z"/>
                <path d="M9.6 20.4v-6.2h4.8v6.2"/>
            </svg>
            <span>首页</span>
        </a>
        <a class="tab" href="#">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round" stroke-linejoin="round">
                <path d="M5.4 3.6h13.2v17.2l-3.3-2.2-3.3 2.2-3.3-2.2-3.3 2.2z"/>
                <path d="M9 8.2h6M9 12.4h6"/>
            </svg>
            <span>订单</span>
        </a>
        <a class="tab" href="#">
            <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round" stroke-linejoin="round">
                <circle cx="12" cy="8" r="3.8"/>
                <path d="M4.6 20.4c.7-3.8 3.8-6 7.4-6s6.7 2.2 7.4 6"/>
            </svg>
            <span>我的</span>
        </a>
    </nav>
</div>
</body>
</html>
