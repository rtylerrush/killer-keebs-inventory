package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       // Uncomment before submitting
    if(partRepository.count() == 0){
        //Part 1
        OutsourcedPart part1= new OutsourcedPart();
        part1.setCompanyName("Krazy Keys");
        part1.setName("Blue PBT Keycaps");
        part1.setInv(5);
        part1.setPrice(20.0);
        part1.setId(100L);
        part1.setMaxInv(5);
        part1.setMinInv(0);
        outsourcedPartRepository.save(part1);
        OutsourcedPart thePart1=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Blue PBT Keycaps"))thePart1=part;
        }

        System.out.println(thePart1.getCompanyName());
        //comment


        //Part 2
        OutsourcedPart part2= new OutsourcedPart();
        part2.setCompanyName("SuperSwitches");
        part2.setName("Tealwood Switches");
        part2.setInv(5);
        part2.setPrice(15.0);
        part2.setId(101L);
        part2.setMaxInv(5);
        part2.setMinInv(0);
        outsourcedPartRepository.save(part2);
        OutsourcedPart thePart2=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Blue PBT Keycaps"))thePart2=part;
        }

        System.out.println(thePart2.getCompanyName());

        //Part 3
        OutsourcedPart part3= new OutsourcedPart();
        part3.setCompanyName("Keyboard Depot");
        part3.setName("White Keyboard Plate");
        part3.setInv(5);
        part3.setPrice(45.0);
        part3.setId(102L);
        part3.setMaxInv(5);
        part3.setMinInv(0);
        outsourcedPartRepository.save(part3);
        OutsourcedPart thePart3=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("White Keyboard Plate"))thePart3=part;
        }

        System.out.println(thePart3.getCompanyName());

        //Part 4
        OutsourcedPart part4= new OutsourcedPart();
        part4.setCompanyName("Foam World");
        part4.setName("Sound Absorbent Foam");
        part4.setInv(5);
        part4.setPrice(10.0);
        part4.setId(103L);
        part4.setMaxInv(5);
        part4.setMinInv(0);
        outsourcedPartRepository.save(part4);
        OutsourcedPart thePart4=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("White Keyboard Plate"))thePart4=part;
        }

        System.out.println(thePart4.getCompanyName());

        //Part 5
        OutsourcedPart part5= new OutsourcedPart();
        part5.setCompanyName("Keyboard Depot");
        part5.setName("Plate");
        part5.setInv(5);
        part5.setPrice(15.0);
        part5.setId(104L);
        part5.setMaxInv(5);
        part5.setMinInv(0);
        outsourcedPartRepository.save(part5);
        OutsourcedPart thePart5=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("White Keyboard Plate"))thePart5=part;
        }

        System.out.println(thePart5.getCompanyName());


        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
     }

        //Products
        // Uncomment before submitting
        if(productRepository.count() == 0) {
        Product keyboard1= new Product("Raptor Pro 88",125.0,5);
        Product keyboard2= new Product("Eclipse MK-II",180.0,5);
        Product keyboard3= new Product("Starlight Vanguard",100.0,5);
        Product keyboard4= new Product("Titan RGB 2.0",100.0,5);
        Product keyboard5= new Product("Nebula Specter 65",235.0,5);
        productRepository.save(keyboard1);
        productRepository.save(keyboard2);
        productRepository.save(keyboard3);
        productRepository.save(keyboard4);
        productRepository.save(keyboard5);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
