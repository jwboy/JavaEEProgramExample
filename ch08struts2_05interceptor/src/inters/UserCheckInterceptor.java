package inters;

import actions.UserLogin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserCheckInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		Object obj = ai.getAction();
		if (obj != null) {
			if (obj instanceof UserLogin) {
				UserLogin action = (UserLogin) obj;
				String userName = action.getUsername();
				int logTime = action.getTime();
				if (userName.endsWith("_cie")) {
					return ai.invoke();
				} else {
					UserLogin.timesAdd1();
					if (logTime < 3) {
						action.addActionMessage("你不是系统中的合法用户，请核实后再登陆");
						return Action.INPUT;
					} else {
						return Action.ERROR;
					}
				}
			}
		}
		return null;
	}
}