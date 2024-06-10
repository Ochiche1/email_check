package com.assessment.emailcheck.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {
    private boolean blacklisted;
    private boolean malicious_activity;
    private boolean malicious_activity_recent;
    private boolean credentials_leaked;
    private boolean credentials_leaked_recent;
    private boolean data_breach;
    private String first_seen;
    private String last_seen;
    private boolean domain_exists;
    private String domain_reputation;
    private boolean new_domain;
    private boolean suspicious_tld;
    private boolean spam;
    private boolean free_provider;
    private boolean disposable;
    private boolean deliverable;
    private boolean accept_all;
    private boolean valid_mx;
    private String primary_mx;
    private boolean spoofable;
    private boolean spf_strict;
    private boolean dmarc_enforced;
    private List<String> profiles;
}
