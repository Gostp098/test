package com.example.crud.service;

import com.example.crud.entity.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    Client editClient(Client client);

    void deleteClient(Integer idClient);

    List<Client> retrieveAllClients();
}