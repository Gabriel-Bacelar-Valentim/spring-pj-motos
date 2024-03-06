package br.com.fiap.springpjmotos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_2TDSPJ_SPRING_MOTOS")
public class TipoDeVeiculo {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "SQ_TIPO_VEICULO")
        @SequenceGenerator(name = "SQ_TIPO_VEICULO",
                sequenceName = "SQ_TIPO_VEICULO",
                initialValue = 1,
                allocationSize = 1
        )
        @Column(name = "ID_TIPO_VEICULO")
        private Long id;

        @Column(name = "NM_TIPO_VEICULO")
        private String nome;

    }

