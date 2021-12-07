package donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.User;
import user.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donation")
public class DonationController {

    private DonationService donationService;

    @Autowired
    public DonationController(UserService userService) {
        this.donationService = donationService;
    }

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @GetMapping("{id}")
    public Optional<Donation> getDonationById(@PathVariable("id") int id) throws Exception {
        return donationService.getDonationById(id);
    }

    @PostMapping
    public void createDonation(@RequestBody Donation donation) {
        donationService.createDonation(donation);
    }
}
