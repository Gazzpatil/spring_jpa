package org.example.customseq_generator;

import org.example.customseq_generator.model.Address;
import org.example.customseq_generator.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CustomSeqGeneratorApplication {

    public static void main(String[] args) {
    ApplicationContext context= SpringApplication.run(CustomSeqGeneratorApplication.class, args);

//        AccountRepo bean = context.getBean(AccountRepo.class);
       /*AccountPk accountPk = new AccountPk();
        accountPk.setAccount_Id(2);
        accountPk.setAccount_Num("123459");
        accountPk.setAccount_Type("Current");*/
        /*Account account = new Account();
        account.setAccount_name("samanta");
        account.setAccount_branch("pune");
        account.setAccount_pk(accountPk);
        bean.save(account);*/

        /*System.out.println(bean.findById(accountPk));*/

      /*  List<Account> account = bean.getAccount();
       for(Account account1: account) {
           System.out.println(account1);
       }*/
       /* Employee e1=new Employee();


        Address address1=new Address();
        address1.setArea("srn");
        address1.setCity("San Francisco");
        address1.setState("CA");
        address1.setEmployee(e1);

        Address address2=new Address();
        address2.setCity("bidar");
        address2.setState("CA");
        address2.setEmployee(e1);
        address2.setArea("KPHB");

        List<Address> list = Arrays.asList(address2, address1);


        e1.setEmployeeName("karter");
        e1.setEmployeeEmail("karter@gmail.com");
        e1.setEmployeeAddress(list);

        List<Address> addresses=new ArrayList<>();
        EmployeeRepo bean = context.getBean(EmployeeRepo.class);
        Employee save = bean.save(e1);
        System.out.println(save);*/

        

    }
}
