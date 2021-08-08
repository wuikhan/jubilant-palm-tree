package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class Day15_Cookies extends Utilities {

	public static void main(String[] args) throws Exception {
		openBrowser("chrome", "http://qa.news.ibextechnologies.us/");
		// access the cookies
		Set<Cookie> allCookies = driver.manage().getCookies();
		int len = allCookies.size();//1
		System.out.println(len);
		
		for(Cookie cookie : allCookies) {
			System.out.println(cookie);
		}
		// deletion
		driver.manage().deleteCookieNamed("has_js");
		Set<Cookie> allCookies2 = driver.manage().getCookies();
		System.out.println(allCookies2.size());
		
		// add a cookie
		Cookie name = new Cookie("cookie123","ABCDEFGHI");
		driver.manage().addCookie(name);
		Set<Cookie> newCookies = driver.manage().getCookies();
		System.out.println(newCookies.size());// 1
		
		for(Cookie newCookie : newCookies) {
			System.out.println(newCookie);
		}
	}
}
