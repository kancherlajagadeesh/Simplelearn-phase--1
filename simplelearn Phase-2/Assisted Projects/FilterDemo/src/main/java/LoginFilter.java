import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

   
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

       
        public void destroy() {
                // TODO Auto-generated method stub
        }

       
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                // TODO Auto-generated method stub
                // place your code here
                
                String userId = request.getParameter("userid");

                if( userId != null){
                        chain.doFilter(request, response);
            }
                 
                
        }

       
        public void init(FilterConfig fConfig) throws ServletException {
                // TODO Auto-generated method stub
        }

}

