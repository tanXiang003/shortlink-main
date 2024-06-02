package com.nageoffer.shortlink.project.mq.producer;

//public class Producer {
//
//    /**
//     * The number of produced messages.
//     */
//    public static final int MESSAGE_COUNT = 1000;
//    public static final String PRODUCER_GROUP = "shportlinkProducerGroup";
//    public static final String DEFAULT_NAMESRVADDR = "172.17.206.17:9876";
//    public static final String TOPIC = "shortlink";
//    public static final String TAG = "TagA";
//
//    public static void main(String[] args) throws MQClientException, InterruptedException {
//
//        /*
//         * Instantiate with a producer group name.
//         */
//        DefaultMQProducer producer = new DefaultMQProducer(PRODUCER_GROUP);
//
//        /*
//         * Specify name server addresses.
//         *
//         * Alternatively, you may specify name server addresses via exporting environmental variable: NAMESRV_ADDR
//         * <pre>
//         * {@code
//         *  producer.setNamesrvAddr("name-server1-ip:9876;name-server2-ip:9876");
//         * }
//         * </pre>
//         */
//        // Uncomment the following line while debugging, namesrvAddr should be set to your local address
//         producer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
//
//        /*
//         * Launch the instance.
//         */
//        producer.start();
//
//        for (int i = 0; i < MESSAGE_COUNT; i++) {
//            try {
//
//                /*
//                 * Create a message instance, specifying topic, tag and message body.
//                 */
//                Message msg = new Message(TOPIC /* Topic */,
//                    TAG /* Tag */,
//                    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
//                );
//
//                /*
//                 * Call send message to deliver message to one of brokers.
//                 */
//                SendResult sendResult = producer.send(msg, 20 * 1000);
//                /*
//                 * There are different ways to send message, if you don't care about the send result,you can use this way
//                 * {@code
//                 * producer.sendOneway(msg);
//                 * }
//                 */
//
//                /*
//                 * if you want to get the send result in a synchronize way, you can use this send method
//                 * {@code
//                 * SendResult sendResult = producer.send(msg);
//                 * System.out.printf("%s%n", sendResult);
//                 * }
//                 */
//
//                /*
//                 * if you want to get the send result in a asynchronize way, you can use this send method
//                 * {@code
//                 *
//                 *  producer.send(msg, new SendCallback() {
//                 *  @Override
//                 *  public void onSuccess(SendResult sendResult) {
//                 *      // do something
//                 *  }
//                 *
//                 *  @Override
//                 *  public void onException(Throwable e) {
//                 *      // do something
//                 *  }
//                 *});
//                 *
//                 *}
//                 */
//
//                System.out.printf("%s%n", sendResult);
//            } catch (Exception e) {
//                e.printStackTrace();
//                Thread.sleep(1000);
//            }
//        }
//
//        /*
//         * Shut down once the producer instance is no longer in use.
//         */
//        producer.shutdown();
//    }
//}