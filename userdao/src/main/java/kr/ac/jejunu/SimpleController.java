package kr.ac.jejunu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
@RequestMapping

@RequiredArgsConstructor
//public class SimpleController implements Controller {
public class SimpleController {

    private final UserDao userDao;

    @RequestMapping("/user")
    public User getUser(@RequestParam("id") Integer id) {
        return userDao.findById(id);
    }
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        User user = userDao.findById(Integer.valueOf(request.getParameter("id")));
//        ModelAndView modelAndView = new ModelAndView("user");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
}
