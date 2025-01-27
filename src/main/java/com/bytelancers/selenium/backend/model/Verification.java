package com.bytelancers.selenium.backend.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Verification {
    private boolean email;
    private boolean phone;
    private boolean payment;
    private boolean identity;

}
