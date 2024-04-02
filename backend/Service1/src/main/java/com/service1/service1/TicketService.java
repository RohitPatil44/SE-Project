package com.service1.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        ticket.setStatus("Open");
        return ticketRepository.save(ticket);
    }

    public Ticket assignTicket(Long ticketId, String assignee) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if (ticket != null) {
            ticket.setAssignee(assignee);
            return ticketRepository.save(ticket);
        }
        return null;
    }

    public Ticket closeTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if (ticket != null) {
            ticket.setStatus("Closed");
            return ticketRepository.save(ticket);
        }
        return null;
    }

    public Ticket reopenTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if (ticket != null) {
            ticket.setStatus("Open");
            return ticketRepository.save(ticket);
        }
        return null;
    }
}

