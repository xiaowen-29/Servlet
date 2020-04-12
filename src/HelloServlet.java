import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
    public class HelloServlet extends HttpServlet{
        public void doGet(HttpServletRequest req,HttpServletResponse resp)throws SecurityException,IOException {
            resp.setContentType("text/html;charset=UTF-8");
            req.setCharacterEncoding("UTF-8");
            String stuid=req.getParameter("stuid");
            String username=req.getParameter("username");
            String date=req.getParameter("date");
            String sex=req.getParameter("sex");
            String[] values=req.getParameterValues("fruit");
            PrintWriter out=resp. getWriter();
            out. println("<html>");
            out. println("<head><title>表单提交信息</title></head>");
            out. println("<body>");
            out. println("<h1>"+stuid+"</h1>");
            out. println("<h1>"+username+"</h1>");
            out. println("<h1>"+date+"</h1>");
            out. println("<h1>"+sex+"</h1>");
            if(values!=null&&values.length>0) {
                for(int i= 0 ;i<values.length;i++)
                    out.println(values[i])  ;
            }
            out. println("</body>");
            out. println("</html>");
            out. close();
        }
        public void doPost(HttpServletRequest req,HttpServletResponse resp)throws SecurityException,IOException {
            this.doGet(req,resp);
        }
    }


