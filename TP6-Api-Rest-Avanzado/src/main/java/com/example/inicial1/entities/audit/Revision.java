package com.example.inicial1.entities.audit;


import jakarta.persistence.*;


import com.example.inicial1.config.CustomRevisionListener;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Entity
@Table(name = "REVISION_INFO", schema = "rbac") // Especifica el esquema "rbac"
@RevisionEntity(CustomRevisionListener.class)
@Data

public class Revision implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
        name ="revision_seq",
        sequenceName="rbac.seq_revision_id"
    )
    @RevisionNumber
    private int id;

    @Column(name="REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
