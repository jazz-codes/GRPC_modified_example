// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string lastname = 2;</code>
   * @return The lastname.
   */
  java.lang.String getLastname();
  /**
   * <code>string lastname = 2;</code>
   * @return The bytes for lastname.
   */
  com.google.protobuf.ByteString
      getLastnameBytes();

  /**
   * <code>int32 cin = 3;</code>
   * @return The cin.
   */
  int getCin();

  /**
   * <code>int32 age = 4;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>string gender = 5;</code>
   * @return The gender.
   */
  java.lang.String getGender();
  /**
   * <code>string gender = 5;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();
}
