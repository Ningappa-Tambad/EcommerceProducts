package com.springacademy.productservicejune24.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/say")
public class SampleController
{

    @GetMapping("/hello/{name}/{times}")
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("times") int times)
    {

        String output="";
        for(int i=0;i<times;i++)
        {
            output=output+"Hello "+name;
        }
        return output;
    }

    @GetMapping("/bye")
    public  String sayBye()
    {
        return "Bye EVERYONE";
    }

    @GetMapping("/Gajanan")
    public  String sayGajanan()
    {
        return "SHREE GAJANAN PRASAN";
    }

    @GetMapping("/Bagamma")
    public  String sayBagamma()
    {
        return "SHREE BHAGYAVANTI DEVI PRASAN";
    }



    @GetMapping("/Banashankari")
    public  String sayBanashankari()
    {
        return "SHREE BANASHANKARI DEVI PRASAN";
    }


    @GetMapping("/Ishwar")
    public  String sayIshwar()
    {
        return "SHREE ISHWAR PRASAN";
    }

    @GetMapping("/Danamma")
    public  String sayDanamma()
    {
        return "SHREE DANAMMA DEVI PRASAN";
    }

    @GetMapping("/Siddaroodha")
    public  String saySiddharoodha()
    {
        return "SHREE SIDDAROODHA PRASAN";
    }

    @GetMapping("/Anjaneya")
    public  String sayAnjaneya()
    {
        return "SHREE ANJANEYA SWAMY PRASAN";
    }


    @GetMapping("/Saibaba")
    public  String saySaibaba()
    {
        return "SHREE SAI RAM";
    }


    @GetMapping("/Mahipatiswamy")
    public  String sayMahipatySwamy()
    {
        return "SHREE MAHIPATI SWAMY PRASAN";
    }

    @GetMapping("/Saraswatidevi")
    public  String saySaraswatidevi()
    {
        return "SHREE SARASWATI DEVI PRASAN";
    }

    @GetMapping("/Lakshmidevi")
    public  String sayLakshmidevi()
    {
        return "SHREE LAKSHMI DEVI PRASAN";
    }

    @GetMapping("/Veerabhadraswamy")
    public  String sayVeerabhadraswamy()
    {
        return "SHREE VEERABHADRASWAMY PRASAN";
    }

    @GetMapping("/Brahmadeva")
    public  String sayBrahmadeva()
    {
        return "OM BRAHMADEVAYA NAMAHA";
    }

    @GetMapping("/Shreekrishna")
    public  String sayShreekrishna()
    {
        return "HARE HARE RAM RAM RAM HARE HARE..HARE KRISHNA HARE KRISHNA KRISHNA KRISHNA HARE HARE";
    }


    @GetMapping("/Subramanyaswamy")
    public  String saySubramanyaswamy()
    {
        return "SHREE SUBRAMANYA SWAMY NAMAHA";
    }

    @GetMapping("/Narayanaya")
    public  String sayNarayanaya()
    {
        return "OM NAMO NARAYANAYA";
    }

    @GetMapping("/Lakshmidevi")
    public  String sayLakahmidevi()
    {
        return "SHREE LAKSHMI NARAYANAYA NAMAHA";
    }










}




/*
   http://localhost:8080/say/hello
      http://localhost:8080/say/bye



 */
