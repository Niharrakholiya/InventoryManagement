    package com.example.demo.Entity;

    import com.fasterxml.jackson.annotation.*;
    import jakarta.persistence.*;
    import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
    import org.springframework.context.annotation.Bean;

    import java.util.List;

    @Entity
    public class Supplier {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String contactInformation;


        // Getters and setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContactInformation() {
            return contactInformation;
        }

        public void setContactInformation(String contactInformation) {
            this.contactInformation = contactInformation;
        }


        @Override
        public String toString() {
            return "Supplier{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", contactInformation='" + contactInformation + '\'' +
                    '}';
        }
    }
