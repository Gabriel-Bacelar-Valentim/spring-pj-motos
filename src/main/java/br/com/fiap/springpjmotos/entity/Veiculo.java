package br.com.fiap.springpjmotos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_2TDSPJ_SPRING_MOTOS")

public class Veiculo {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "SQ_VEICULO")
        @SequenceGenerator(name = "SQ_VEICULO",
                sequenceName = "SQ_VEICULO",
                initialValue = 1,
                allocationSize = 1
        )
        @Column(name = "ID_VEICULO")
        private Long id;

        @Column(name = "NM_VEICULO")
        private String nome;

        @Column(name = "NM_COR")
        private String cor;

        @Column(name = "NM_PRECO")
        private Double preco;

        @Column(name = "NM_CILINDRADAS")
        private Short cilindradas;



    }

