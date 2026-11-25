<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover">
  <meta name="theme-color" content="#FF5A2E">
  <title>味达外卖 · 登录</title>
  <link rel="stylesheet" href="css/login.css">
</head>
<body>
<main class="phone">
  <!-- 顶部视觉区 -->
  <section class="hero">
    <img class="hero__img"
         src="https://trae-api-cn.mchost.guru/api/ide/v1/text_to_image?prompt=flat%20lay%20of%20chinese%20delivery%20food%20boxes%20with%20noodles%20dumplings%20and%20bubble%20tea%20on%20dark%20textured%20table%20moody%20cinematic%20top%20view%20food%20photography&image_size=portrait_16_9"
         alt="外卖美食">
    <div class="hero__mask"></div>

    <div class="hero__brand">
      <div class="logo" aria-hidden="true">
        <svg viewBox="0 0 24 24" fill="none" stroke="#fff" stroke-width="1.6" stroke-linecap="round" stroke-linejoin="round">
          <path d="M3.5 11.5h17a8.5 8.5 0 0 1-17 0Z"/>
          <path d="M8 19.5h8"/>
          <path d="M16.8 4.5 19.2 10"/>
        </svg>
      </div>
      <div class="brand-text">
        <strong>味达外卖</strong>
        <span>好味道 · 30 分钟送达</span>
      </div>
    </div>
  </section>

  <!-- 登录表单区 -->
  <section class="sheet">
    <h1>欢迎回来</h1>
    <p class="sheet__sub">登录后开启今日的美味灵感</p>

    <form class="form" action="logina.do" method="post" autocomplete="off">
      <label class="field">
        <svg class="field__icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round">
          <circle cx="12" cy="8" r="3.6"/>
          <path d="M4.8 20c.6-3.6 3.6-5.6 7.2-5.6s6.6 2 7.2 5.6"/>
        </svg>
        <input type="text" name="username" placeholder="用户名 / 手机号" autocomplete="off">
      </label>

      <label class="field">
        <svg class="field__icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round">
          <rect x="4.5" y="10.5" width="15" height="9.5" rx="2.6"/>
          <path d="M8 10.5V8a4 4 0 0 1 8 0v2.5"/>
          <circle cx="12" cy="15.3" r="1.2" fill="currentColor" stroke="none"/>
        </svg>
        <input type="password" name="password" placeholder="密码" autocomplete="new-password">
      </label>

      <div class="form__extra">
        <label class="remember">
          <input type="checkbox" checked>
          <span>记住登录</span>
        </label>
        <a class="link" href="#">忘记密码？</a>
      </div>

      <button class="btn" type="submit">登 录</button>
    </form>

    <div class="divider"><span>其他登录方式</span></div>

    <div class="socials">
      <a class="social" href="#" aria-label="微信登录">
        <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
          <path d="M9.5 4.5c-3.6 0-6.5 2.3-6.5 5.2 0 1.6.9 3 2.3 4l-.6 2 2.2-1.1c.8.2 1.6.3 2.6.3"/>
          <path d="M20.9 15.1c0-2.4-2.4-4.3-5.4-4.3s-5.4 1.9-5.4 4.3 2.4 4.3 5.4 4.3c.7 0 1.4-.1 2-.3l1.9.9-.5-1.7c1.2-.8 2-1.9 2-3.2Z"/>
        </svg>
      </a>
      <a class="social" href="#" aria-label="手机号登录">
        <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
          <rect x="6.5" y="2.8" width="11" height="18.4" rx="2.6"/>
          <path d="M10.5 18.2h3"/>
        </svg>
      </a>
      <a class="social" href="#" aria-label="邮箱登录">
        <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round">
          <rect x="3.2" y="5.2" width="17.6" height="13.6" rx="2.6"/>
          <path d="m4.2 7 7.8 5.6L19.8 7"/>
        </svg>
      </a>
    </div>

    <p class="tip">还没有账号？<a class="link" href="#">立即注册</a></p>
    <p class="agreement">登录即代表你已阅读并同意<a href="#">《用户协议》</a>和<a href="#">《隐私政策》</a></p>
  </section>
</main>
</body>
</html>

