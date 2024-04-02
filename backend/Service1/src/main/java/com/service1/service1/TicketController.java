package com.service1.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @PutMapping("/{ticketId}/assign")
    public Ticket assignTicket(@PathVariable Long ticketId, @RequestParam String assignee) {
        return ticketService.assignTicket(ticketId, assignee);
    }

    @PutMapping("/{ticketId}/close")
    public Ticket closeTicket(@PathVariable Long ticketId) {
        return ticketService.closeTicket(ticketId);
    }

    @PutMapping("/{ticketId}/reopen")
    public Ticket reopenTicket(@PathVariable Long ticketId) {
        return ticketService.reopenTicket(ticketId);
    }
}

