    package com.example.demo.Entity;

    import com.fasterxml.jackson.annotation.JsonBackReference;
    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
    import jakarta.persistence.*;
    import java.io.Serializable;
    import java.math.BigDecimal;
    import java.util.Date;

    @Entity
    @Table(name = "customer_order")
    public class Order  {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Date date;
        private BigDecimal totalAmount;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "customer_id")
        @JsonBackReference
        private Customer customer;


        // Getters and setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", date=" + date +
                    ", totalAmount=" + totalAmount +
                    ", customer=" + customer +
                    '}';
        }
    }
